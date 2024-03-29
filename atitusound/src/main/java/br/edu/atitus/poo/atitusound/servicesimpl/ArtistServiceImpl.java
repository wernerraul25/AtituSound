package br.edu.atitus.poo.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitusound.entities.ArtistEntity;
import br.edu.atitus.poo.atitusound.repositories.ArtistRepository;
import br.edu.atitus.poo.atitusound.repositories.GenericRepository;
import br.edu.atitus.poo.atitusound.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {
	private final ArtistRepository repository;

	public ArtistServiceImpl(ArtistRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public GenericRepository<ArtistEntity> getRepository() {
		return repository;
	}

	

}