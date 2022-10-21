package com.asesoftware.apprueba.service;

import java.util.List;
import java.util.Optional;
import com.asesoftware.apprueba.entity.Comercio;

public interface IComercioService {
	public abstract List<Comercio> findAllComercio();
	public abstract Optional<Comercio> findByIdComercio(Integer idComercio);
}
