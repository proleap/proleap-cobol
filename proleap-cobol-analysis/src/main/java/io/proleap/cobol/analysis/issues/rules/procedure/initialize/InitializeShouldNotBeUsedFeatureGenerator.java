package io.proleap.cobol.analysis.issues.rules.procedure.initialize;

import java.util.stream.Stream;

import jakarta.inject.Singleton;

import io.proleap.cobol.analysis.issues.rules.FeatureGenerator;
import io.proleap.cobol.asg.metamodel.CompilationUnit;
import io.proleap.cobol.asg.metamodel.procedure.Statement;
import io.proleap.cobol.asg.metamodel.procedure.StatementTypeEnum;
import io.proleap.cobol.commons.util.CobolStreamUtils;

@Singleton
public class InitializeShouldNotBeUsedFeatureGenerator extends FeatureGenerator<Statement> {

	@Override
	public Stream<Statement> getAll(final CompilationUnit compilationUnit) {
		return CobolStreamUtils.statementsRec(compilationUnit).filter(statement -> {
			return isRelevantStatement(statement);
		});
	}

	protected boolean isRelevantStatement(final Statement statement) {
		final boolean isInitializeStatement = StatementTypeEnum.INITIALIZE.equals(statement.getStatementType());
		return isInitializeStatement;
	}
}
