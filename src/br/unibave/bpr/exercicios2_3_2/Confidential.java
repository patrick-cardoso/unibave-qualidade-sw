package br.unibave.bpr.exercicios2_3_2;import java.io.File;public class Confidential extends AbstractProvider {	private final String PATH = "/br/unibave/bpr/exercicios2_3_2/resources/confidencial.txt";	protected String retrieveInfo() throws Exception {		File archive = new File(Public.class.getProtectionDomain()				.getCodeSource().getLocation().getPath()+PATH);		ResourceUtils<Confidential> resourceUtils = new ResourceUtils<>();		return resourceUtils.getContentFile(archive, this);	}}