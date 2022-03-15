package ksmart42.khtour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeritageController {
	
	/*
	 * 문화재 정보 등록 
	 */
	@GetMapping("/heritage/heritageInsert")
	public String addHeritage(Model model) {
		
		model.addAttribute("title", "문화재 등록 페이지");
		
		return "/heritage/heritageInsert";
	}
	
	/*
	 * 문화재 정보 수정 
	 */
	@GetMapping("/heritage/heritageModify")
	public String modifyHeritage(Model model) {
		
		model.addAttribute("title", "문화재 정보 수정 페이지");
		
		return "/heritage/heritageModify";
	}
	
	/*
	 * 문화재 종목별 검색 
	 */
	@GetMapping("/heritage/heritageSearchListByItem")
	public String getHeritageSearchListByItem(Model model) {
		
		model.addAttribute("title", "문화재 종목별 검색 페이지");
		
		return "/heritage/heritageSearchListByItem";
	}
	
	/*
	 * 문화재 지도별 검색 
	 */
	@GetMapping("/heritage/heritageSearchListByRegion")
	public String getHeritageSearchListByRegion(Model model) {
		
		model.addAttribute("title", "문화재 지도별 검색 페이지");
		
		return "/heritage/heritageSearchListByRegion";
	}
	
	/*
	 * 문화재 지역 지도 
	 */
	@GetMapping("/heritage/heritageSearchMap")
	public String getHeritageSearchMap(Model model) {
		
		model.addAttribute("title", "문화재 지역 지도 페이지");
		
		return "/heritage/heritageSearchMap";
	}
	
	/*
	 * 문화재 정보 삭제
	 */
	@GetMapping("/heritage/heritageDelete")
	public String deleteHeritage(Model model){
		
		model.addAttribute("title", "문화재 삭제 페이지");
		
		return "/heritage/heritageDelete";
	}
}
