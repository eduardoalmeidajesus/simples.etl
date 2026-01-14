package br.edu.utfpr.td.tsi.simples.etl;

import java.util.List;

public abstract class Carregador<T> {

	public abstract void carregar(List<T> item);

}
