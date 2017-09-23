package com.travel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HotelWrapper implements Serializable{


		
		/**
	 * 
	 */
	private static final long serialVersionUID = -5574501146690521074L;
		private List<HotelDetails> details;

		public List<HotelDetails> getHotels() {
			return details;
		}

		public void setHotels(List<HotelDetails> hotel) {
			details = hotel;
		}


}
