package com.duduprojeto.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duduprojeto.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
