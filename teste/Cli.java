package teste;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Cli {

	private String[] args = null;
	private Options options = new Options();
	private Calc calculadora = new Calc();


	public Cli(String[] args) {

		this.args = args;
		options.addOption("h", "help", false, "show help.");
		options.addOption("b", true, "convert decimal to binary.");

	}

	public void parse() {
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd;
		try {
			cmd = parser.parse( options, args);
			if(cmd.hasOption("h")) {
				help();
			}
			if(cmd.hasOption("b")) {
				int inteiro = Integer.parseInt(cmd.getOptionValue("b"));
				binario(inteiro);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			help();
		}

	}

	private void help() {
		HelpFormatter formater = new HelpFormatter();
		formater.printHelp("Calc", options);
		System.exit(0);
	}

	private void binario(int inteiro) {
		calculadora.binario(inteiro);
	}


}
