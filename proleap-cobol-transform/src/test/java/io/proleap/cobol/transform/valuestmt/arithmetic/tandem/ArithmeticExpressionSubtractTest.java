package io.proleap.cobol.transform.valuestmt.arithmetic.tandem;

import java.io.File;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;
import io.proleap.cobol.transform.runner.CobolTransformationTestRunner;

@MicronautTest
public class ArithmeticExpressionSubtractTest {

	@Inject
	protected CobolTransformationTestRunner runner;

	@Test
	public void test() throws Exception {
		final File inputFile = new File(
				"src/test/resources/io/proleap/cobol/transform/valuestmt/arithmetic/tandem/ArithmeticExpressionSubtract.cbl");
		runner.transformFile(inputFile, CobolSourceFormatEnum.TANDEM);
	}
}