package br.com.fatec;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class LeitorJSON implements Leitor {

	@Override
	public ArrayList<Pessoa> Ler() {

		ArrayList<Pessoa> lista;
		Gson gson = new Gson();

		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\Users\\leona\\Desktop\\remessa.json"), "UTF-8"));
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Pessoa[] pessoas = gson.fromJson(br, Pessoa[].class);
		lista = new ArrayList<Pessoa>(Arrays.asList(pessoas));

		return lista;
	}
}
