package io.proleap.cobol.analysis.issues.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;
import io.proleap.cobol.analysis.TestBase;
import io.proleap.cobol.analysis.issues.rules.data.PackedNumericFieldsShouldBeDefinedWithOddLengthFeatureGenerator;
import io.proleap.cobol.asg.metamodel.CompilationUnit;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry;
import io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl;
import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

@MicronautTest
public class PackedNumericFieldsShouldBeDefinedWithOddLengthTest extends TestBase {

	@Inject
	private PackedNumericFieldsShouldBeDefinedWithOddLengthFeatureGenerator feature;

	@Test
	public void test() throws Exception {
		final File inputFile = new File(
				"src/test/resources/io/proleap/cobol/analysis/issues/data/PackedNumericFieldsShouldBeDefinedWithOddLength.cbl");
		final Program program = new CobolParserRunnerImpl().analyzeFile(inputFile, CobolSourceFormatEnum.TANDEM);
		final CompilationUnit compilationUnit = program
				.getCompilationUnit("PackedNumericFieldsShouldBeDefinedWithOddLength");
		final List<DataDescriptionEntry> dataDescriptionEntries = feature.getAll(compilationUnit)
				.collect(Collectors.toList());

		assertEquals(3, dataDescriptionEntries.size());
	}

}
