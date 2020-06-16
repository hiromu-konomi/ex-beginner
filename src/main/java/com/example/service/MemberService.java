package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

import java.util.List;

@Service
@Transactional
public class MemberService {

	@Autowired
	private MemberRepository repository;
	
	public List<Member> findBy(String likeName) {
		return repository.findBy(likeName);
	}
}
