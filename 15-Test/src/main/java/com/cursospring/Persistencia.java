package com.cursospring;

import org.springframework.stereotype.Repository;

@Repository
public class Persistencia implements IPersistencia {

	/* (non-Javadoc)
	 * @see com.cursospring.IPersistencia#salvar(java.lang.String)
	 */
	@Override
	public long salvar(String dato){
		return 27 - dato.length();
	}
	
}
