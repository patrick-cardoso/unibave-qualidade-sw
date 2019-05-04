package br.unibave.bpr.exercicios2_3_2;

import java.io.File;
import java.util.Scanner;


public final class ResourceUtils<T extends AbstractProvider> {


	public String getContentFile(File archive, T scann) throws Exception {

		StringBuffer buffer = new StringBuffer();

		Scanner scanner = scann.newScan(archive);
		while (scanner.hasNextLine()) {
			buffer.append(scanner.nextLine());
			buffer.append("\n");
		}
		scanner.close();

		return buffer.toString();
	}
}
