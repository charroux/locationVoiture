package location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@Component
@Controller
public class LocationController {
	
	
	/**
	 * @return un tableau JSon de voitures disponibles avec HttpStatus = OK
	 */
	@RequestMapping(value = "/voiture", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	List<Voiture> getVoitures(){
		return new ArrayList<Voiture>();
	}

	/**
	 * 
	 * @param immatriculation
	 * @return on obtient la structure JSon d’une voiture
	 */
	@RequestMapping(value = "/voiture/{immatriculation}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	Voiture getVoiture(@PathVariable("immatriculation") String immatriculation){
		return null;
	}
	
	/**
	 * @param immatriculation de la voiture à louer ou à ramener
	 * @param louer = true si on veut louer une voiture, = false pour ramener la voiture
	 */
	@RequestMapping(value = "/voiture/{immatriculation}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	void louerRamener(@PathVariable("immatriculation") String immatriculation, @RequestParam(value="louer", required = true)boolean louer){
	}
	
	
}
