package com.tao.exdoc.repository;

import com.tao.exdoc.domain.Result;
import com.tao.exdoc.domain.security.Role;

public interface IRoleRepository extends Repository<Role,Integer>{
		
	Result<Role> findAll() throws Exception;
	Role findByKey(Integer key) throws Exception;
	void remove(Integer key) throws Exception;
	Role save(Role entity) throws Exception;
}
