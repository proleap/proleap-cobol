package io.proleap.cobol.interpreter.data.workingstorage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.params.CobolParserParams;
import io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl;
import io.proleap.cobol.interpreter.TestBase;
import io.proleap.cobol.interpreter.domain.state.CobolState;
import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

@MicronautTest
public class DataDescription66ThroughTest extends TestBase {

	@Test
	public void test() throws Exception {
		final File inputFile = new File(
				"src/test/resources/io/proleap/cobol/interpreter/data/workingstorage/DataDescription66Through.cbl");
		final CobolSourceFormatEnum format = CobolSourceFormatEnum.TANDEM;
		final CobolParserParams parserParams = createParserParams(format, inputFile);

		final Program program = new CobolParserRunnerImpl().analyzeFile(inputFile, format);
		final ProgramUnit programUnit = program.getCompilationUnit().getProgramUnit();
		final CobolState state = cobolInterpreterRunner.run(programUnit, createInterpreterParams(parserParams));

		assertEquals(" ".repeat(10), valueService.getString(getValue("ITEM1", programUnit, state)));
		assertEquals(" ".repeat(10), valueService.getString(getValue("ITEM2", programUnit, state)));
		assertEquals(" ".repeat(10), valueService.getString(getValue("ITEM3", programUnit, state)));
		assertEquals(" ".repeat(10), valueService.getString(getValue("ITEM4", programUnit, state)));

		assertEquals(" ".repeat(40), valueService.getString(getValue("ITEMS", programUnit, state)));
		assertEquals(" ".repeat(30), valueService.getString(getValue("ITEMZ", programUnit, state)));
	}
}
