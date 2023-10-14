package io.proleap.cobol.analysis.issues.rules.procedure.statements;

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
import io.proleap.cobol.asg.metamodel.ASGElement;
import io.proleap.cobol.asg.metamodel.CompilationUnit;

@Singleton
public class ObsoleteKeywordsShouldNotBeUsedRule extends IssueRule {

	protected final String DESCRIPTION = "Obsolete keyword at %s.";

	@Inject
	private ObsoleteKeywordsShouldNotBeUsedFeatureGenerator featureGenerator;

	@Override
	public List<IssueDto> apply(final CompilationUnit compilationUnit, final CobolIdRegistry idRegistry) {
		final Stream<ASGElement> elemtents = featureGenerator.getAll(compilationUnit);
		final List<ParserRuleContext> ctxs = elemtents.map(statement -> {
			return statement.getCtx();
		}).collect(Collectors.toList());

		return entriesFromIds(ctxs, compilationUnit, idRegistry, DESCRIPTION, SeverityEnum.MINOR);
	}
}
