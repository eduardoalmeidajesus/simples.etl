package br.edu.utfpr.td.tsi.simples.etl;

import java.util.List;

public abstract class Extrator<T> {

	public abstract List<T> extrair();

}
