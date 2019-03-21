package br.com.fatec;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.TypePermission;

public class LeitorXML implements Leitor {

	@Override
	public ArrayList<Pessoa> Ler() {

		XStream xstream = new XStream(new StaxDriver());
		
		
		xstream.alias("br.com.pageseguro.RemessaCartaoCredito", Pessoa.class);		
		xstream.alias("br.com.pageseguro.RemessaCartaoDebito", Pessoa.class);		
		xstream.alias("br.com.pageseguro.RemessaBoleto", Pessoa.class);

		TypePermission per = new AnyTypePermission();
		xstream.addPermission(per);
		

		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\Users\\leona\\Desktop\\remessa.xml"), "UTF-8"));
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	    @SuppressWarnings("unchecked")
		ArrayList<Pessoa> pessoas =  (ArrayList<Pessoa>) xstream.fromXML(br);

		
		return pessoas;
	}

}
