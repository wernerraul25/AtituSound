package br.edu.atitus.poo.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitusound.dtos.ArtistDTO;
import br.edu.atitus.poo.atitusound.entities.ArtistEntity;
import br.edu.atitus.poo.atitusound.services.ArtistService;
import br.edu.atitus.poo.atitusound.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO>{
	//Possui uma dependência do tipo ArtistService
	private final ArtistService service;
	
	public ArtistController(ArtistService service) {
		super();
		this.service = service;
	}

	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity newArtist = new ArtistEntity();
		newArtist.setName(dto.getName());
		newArtist.setImage(dto.getImage());
		return newArtist;
	}

	@Override
	protected GenericService<ArtistEntity> getService() {
		return service;
	}

}