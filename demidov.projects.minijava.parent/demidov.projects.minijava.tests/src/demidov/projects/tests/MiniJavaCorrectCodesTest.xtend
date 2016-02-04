/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.tests

import com.google.inject.Inject
import demidov.projects.miniJava.Program
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.junit4.AbstractXtextTests
import demidov.projects.validation.MiniJavaValidator
import org.junit.Before
import demidov.projects.MiniJavaStandaloneSetup
import java.io.FileReader
import java.io.BufferedReader

// Correct MiniJava code samples are taken from http://www.cambridge.org/us/features/052182060X/

@RunWith(XtextRunner)
@InjectWith(MiniJavaInjectorProvider)
public class MiniJavaCorrectCodesTest extends AbstractXtextTests {

	@Inject
	ParseHelper<Program> parser;

	ValidatorTester<MiniJavaValidator> tester;
	
	def readSourceFile(String fileName) {
		var text = new StringBuilder();
		var bufferedReader = new BufferedReader( new FileReader( fileName) );
		
		var line = bufferedReader.readLine()
		val newline = System.getProperty("line.separator");
		
		while ( line != null ) {
			text.append(line + newline);		
			line = bufferedReader.readLine()
		}
		
		return text.toString();
	}
		
	@Before
	def void setUpTesting() {
		with(MiniJavaStandaloneSetup);
		val validator = get(MiniJavaValidator);
		tester = new ValidatorTester<MiniJavaValidator>(validator, getInjector());
  	}
	
	@Test
	def testCorrectFactorialCode() {
		val model = parser.parse(
			readSourceFile('.\\src\\demidov\\projects\\tests\\Factorial.mj')
		);
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectBinarySearchCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\BinarySearch.mj'));
 
		tester.validate(model).assertOK();
	}

	@Test
	def testCorrectBubbleSortCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\BubbleSort.mj'));
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectTreeVisitorCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\TreeVisitor.mj'));
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectQuickSortCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\QuickSort.mj'));
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectLinearSearchCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\LinearSearch.mj'));
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectLinkedListCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\LinkedList.mj'));
 
		tester.validate(model).assertOK();
	}
	
	@Test
	def testCorrectBinaryTreeCode() {
		val model = parser.parse(readSourceFile('.\\src\\demidov\\projects\\tests\\BinaryTree.mj'));
 
		tester.validate(model).assertOK();
	}
}