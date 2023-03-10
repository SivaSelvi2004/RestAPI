package com.example.demo.prepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.pdemo.Demo;

import jakarta.transaction.Transactional;

@Repository
public interface DemoRepository extends JpaRepository<Demo,Integer>{
	
	public List<Demo> findByName(String name);
	
	public List<Demo> findByStatus(String status);
	
	public List<Demo> findByIdAndName(int id,String Name);
	
	public List<Demo> findByIdOrName(int id,String Name);
	
	public List<Demo> findByNameAndStatus(String name,String status);
	
	public List<Demo> findByNameStartingWith(String start);
	
	public List<Demo> findByNameEndingWith(String end);
	
	@Query(value="select * from demo",nativeQuery=true)
	public List<Demo> getAllDemo();
	
	@Query(value="from Demo where id=:id or name=:name")
	public List<Demo> getAllIdOrName(@Param("id")int id,@Param("name")String name);
	
	@Modifying
	@Transactional
	@Query(value="Update Demo set status=:status where id=:id")
	public int updateStatusById(@Param("id")int id,@Param("status")String status);
	
}
