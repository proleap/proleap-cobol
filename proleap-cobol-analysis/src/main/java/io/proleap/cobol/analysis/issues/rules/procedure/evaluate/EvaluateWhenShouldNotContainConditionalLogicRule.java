package io.proleap.cobol.analysis.issues.rules.procedure.evaluate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import org.antlr.v4.runtime.ParserRuleContext;

import io.proleap.cobol.analysis.issues.dto.IssueDto;
import io.proleap.cobol.analysis.issues.dto.SeverityEnum;
import io.proleap.cobol.analysis.issues.rules.IssueRule;
import io.proleap.cobol.analysis.registry.CobolIdRegistry;
import io.proleap.cobol.asg.metamodel.CompilationUnit;
import io.proleap.cobol.asg.metamodel.procedure.Statement;

@Singleton
public class EvaluateWhenShouldNotContainConditionalLogicRule extends IssueRule {

	protected final String DESCRIPTION = "Evaluate When structure should not contain conditional logic.";

	@Inject
	private EvaluateWhenShouldNotContainConditionalLogicFeatureGenerator featureGenerator;

	@Override
	public List<IssueDto> apply(final CompilationUnit compilationUnit, final CobolIdRegistry idRegistry) {
		final Stream<Statement> statements = featureGenerator.getAll(compilationUnit);
		final List<ParserRuleContext> ctxs = statements.map(dataDescriptionEntry -> {
			return dataDescriptionEntry.getCtx();
		}).collect(Collectors.toList());

		return entriesFromIds(ctxs, compilationUnit, idRegistry, DESCRIPTION, SeverityEnum.MINOR);
	}
}
