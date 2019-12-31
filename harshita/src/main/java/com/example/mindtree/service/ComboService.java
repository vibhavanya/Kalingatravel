package com.example.mindtree.service;

import java.util.List;

import com.example.mindtree.dto.ComboDto;
import com.example.mindtree.entity.Combo;

public interface ComboService {

	public void addcombo(Combo combo);

	public List getallcombos();

	public void updatecombo(Combo combo);

	public Combo getCombo(int comboId);

//	public List<Combo> getCombowithduration();

}
