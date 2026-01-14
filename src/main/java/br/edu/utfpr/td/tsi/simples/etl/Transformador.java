package br.edu.utfpr.td.tsi.simples.etl;

public abstract class Transformador<I, O> {

	public abstract O transformar(I item);

}
