package io.proleap.cobol.analysis.issues.rules.data;

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
import io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry;

@Singleton
public class BinaryVariablesShouldDeclareTableSizesRule extends IssueRule {

	protected final String DESCRIPTION = "Variable-length table size that depends on non-BINARY/COMP variable at %s makes the use of that table inefficient.";

	@Inject
	private BinaryVariablesShouldDeclareTableSizesFeatureGenerator featureGenerator;

	@Override
	public List<IssueDto> apply(final CompilationUnit compilationUnit, final CobolIdRegistry idRegistry) {
		final Stream<DataDescriptionEntry> entries = featureGenerator.getAll(compilationUnit);
		final List<ParserRuleContext> ctxs = entries.map(dataDescriptionEntry -> {
			return dataDescriptionEntry.getCtx();
		}).collect(Collectors.toList());

		return entriesFromIds(ctxs, compilationUnit, idRegistry, DESCRIPTION, SeverityEnum.MINOR);
	}
}
