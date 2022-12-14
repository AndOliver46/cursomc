package com.andoliver46.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa fisica"), 
	PESSOAJURIDICA(2, "Pessoa juridica");

	private int cod;
	private String descricao;

	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) {
			if (x.getCod() == cod) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
