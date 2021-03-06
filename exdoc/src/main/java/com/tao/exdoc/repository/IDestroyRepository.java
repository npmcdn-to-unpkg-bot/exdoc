package com.tao.exdoc.repository;

import com.tao.exdoc.domain.Result;
import com.tao.exdoc.domain.destroy.Destroy;
import com.tao.exdoc.domain.destroy.DestroyQuery;

public interface IDestroyRepository extends Repository<Destroy,Integer> {

	Result<Destroy> findAll() throws Exception;
	Destroy findByKey(Integer key) throws Exception;
	void remove(Integer key) throws Exception;
	Destroy save(Destroy entity) throws Exception;
	
	Result<Destroy> findByQuery(DestroyQuery query) throws Exception;
}
