package assignment.runpath.genreport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

public class GenerateHtmlReport {

	public static void generateDemoReport() throws IOException {
		File reportOutputDirectory = new File("target/test-report");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target\\cucumber-reports\\cucumber.json");
		String buildNumber = "1";
		String projectName = "webapp";
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		configuration.setBuildNumber(buildNumber);
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");
		configuration.setSortingMethod(SortingMethod.NATURAL);
		configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		System.out.println("report is generated in target/test-report");
	}
	
	public static void main(String[] args) {
		try {
			generateDemoReport();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
