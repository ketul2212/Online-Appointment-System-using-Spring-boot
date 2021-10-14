package com.ketul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketul.demo.model.History;

public interface HistoryRepo extends JpaRepository<History, Integer> {

}
