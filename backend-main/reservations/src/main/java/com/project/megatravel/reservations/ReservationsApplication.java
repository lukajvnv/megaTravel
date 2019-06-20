package com.project.megatravel.reservations;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.project.megatravel.model.accomodation.SmestajnaJedinica;
import com.project.megatravel.model.accomodation.SmestajniObjekat;
import com.project.megatravel.model.reservations.RezervacijaKorisnika;
import com.project.megatravel.model.users.KrajnjiKorisnik;
import com.project.megatravel.reservations.repository.KorisnikRepository;
import com.project.megatravel.reservations.repository.RezervacijeRepository;
import com.project.megatravel.reservations.repository.SjRepository;
import com.project.megatravel.reservations.repository.SoRepository;
import com.project.megatravel.util.Creator;

@EnableDiscoveryClient
@SpringBootApplication
public class ReservationsApplication {

	private final static Logger logger = Logger.getLogger(ReservationsApplication.class.getName());
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		logger.info("Connecting to database");
		
		try {
			ExistDB.initDatabase();
			logger.info("Connection with database established");
		} catch (Exception e) {
			logger.warning("Can't connect to database");
		}
		
		SpringApplication.run(ReservationsApplication.class, args);
		
		logger.info("Reservations microservice successfully started");
		
		Creator cr = new Creator();
		

		RezervacijeRepository r = new RezervacijeRepository();

		SjRepository sjr = new SjRepository();
		SoRepository sjo = new SoRepository();
		KorisnikRepository kr = new KorisnikRepository();
		
		
		KrajnjiKorisnik kk = kr.getByEmail("pera@gmail.com");

		SmestajniObjekat so = cr.createSmestajniObjekat("Apartman");
		sjo.save(so);
		SmestajnaJedinica sj = cr.createSmestajnaJedinica(5,so);
		sjr.save(sj);
		RezervacijaKorisnika rk = cr.createRezervacija(160, 5, "10/1/2019", "19/5/2019", "28/5/2019", "Stanje?", sj,kk);
		r.save(rk);
		
		kk = kr.save(kk);
		SmestajniObjekat so1 = Creator.createSmestajniObjekat("Hotel 5*");
		so1	 = sjo.save(so1);
		SmestajnaJedinica sj1 = Creator.createSmestajnaJedinica(4,so1);
		sj1	 = sjr.save(sj1);
		RezervacijaKorisnika rk1 = Creator.createRezervacija(250, 5, "19/6/2019", "19/7/2019", "28/7/2019", "Stanje?", sj1,kk);
		rk1 = r.save(rk1);

		
	/*	sjo.save(so1);
		sjr.save(sj1);
		r.save(rk1);*/

		//sjo.save(so);
		//sjr.save(sj);
		//r.save(rk);

		
	}

}
