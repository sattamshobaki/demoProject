<%@ page language="java" contentType="text/html; charset=windows-1256"
import="java.util.List, com.travel.model.HotelDetails" pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Demo Application</title>
</head>
<body>
	<form onsubmit="return validateFields()" action="searchDeals">
		<div style="width: 50%; margin: auto">
			<h1>Welcome in Demo Application</h1>
			<table border="0" cellpadding="2" cellspacing="2">
				<tr>
					<td>Destination name: <input type="text"
						name="destinationName" id="destinationName" /></td>
					<td>Min start date: <input type="text" name="minTripStartDate"
						id="minTripStartDate" /></td>
					<td>Max start date: <input type="text" name="maxTripStartDate"
						id="maxTripStartDate" /></td>
				</tr>
				<tr>
					<td>Num of days: <input type="text" name="lengthOfStay"
						id="lengthOfStay" /></td>
					<td>Min star rating: <input type="text" name="minStarRating"
						id="minStarRating" /></td>
					<td>Max star rating: <input type="text" name="maxStarRating"
						id="maxStarRating" /></td>
				</tr>
			</table>
			<input type="submit" value="Search" width="100%"/> <br /> 
			<% List<HotelDetails> hotels = (List<HotelDetails>)request.getAttribute("hotels"); 
				if(hotels == null || hotels.size() ==0){
			%>
			<%}else{ %>
			<table border="1" style=";text-align:center"  cellspacing="1" cellpadding="1">
			<thead style="background-color: gray;">
			<tr>
			<th>Hotel name</th>
			<th>City</th>
			<th>Travel start date</th>
			<th>Travel end date</th>
			<th>hotelStarRating</th>
			<th></th>
			</tr>
			</thead>
						<% for(HotelDetails record: hotels){ %>
						<tr><td><%= record.getHotelInfo().getHotelName()%></td>
						<td><%= record.getHotelInfo().getHotelCity()%></td>
						<td><%= record.getHotelInfo().getTravelStartDate()%></td>
						<td><%= record.getHotelInfo().getTravelEndDate()%></td>
						<td><%= record.getHotelInfo().getHotelStarRating()%></td>
						<td><a href="hotel-details.jsp?Id=<%=record.getHotelInfo().getHotelId()%>">More Details</a></td>
						</tr>
						<% request.getSession().setAttribute("hotelDetails", record);} %>
			</table>
			<%} %>
		</div>
	</form>

	<script>
		function validateFields() {

			var lengthOfStay = document.getElementById("lengthOfStay");
			var minStarRating = document.getElementById("minStarRating");
			var maxStarRating = document.getElementById("maxStarRating");
			var maxTripStartDate = document.getElementById("maxTripStartDate");
			var minTripStartDate = document.getElementById("minTripStartDate");
			if (lengthOfStay.value != null && lengthOfStay.value.trim() != ""
					&& (isNaN(lengthOfStay.value))) {
				alert('length of stay should be number between 1 and 10');
				return false;

			}
			if (minStarRating.value != null && minStarRating.value.trim() != ""
					&& (isNaN(minStarRating.value))) {
				alert('minStarRating should be number');
				return false;

			}

			if (maxStarRating.value != null && maxStarRating.value.trim() != ""
					&& (isNaN(maxStarRating.value))) {
				alert('maxStarRating should be number');
				return false;

			}

			if (maxTripStartDate.value != null
					&& maxTripStartDate.value.trim() != ""
					&& (!isDate(maxTripStartDate.value))) {
				alert('maxTripStartDate should be a valid date eg:(2020-08-20)');
				return false;

			}
			if (minTripStartDate.value != null
					&& minTripStartDate.value.trim() != ""
					&& (!isDate(minTripStartDate.value))) {
				alert('minTripStartDate should be a valid date eg:(2020-08-20)');
				return false;

			}
			return true;
		}

		function isDate(val) {
			var parts = val.split("-");
			if (parts.length != 3) {
				return false;
			}
			if (isNaN(parts[0])
					|| (eval(parts[0]) < 1900 || eval(parts[0]) > 2050)) {
				return false;
			}
			if (isNaN(parts[1]) || (eval(parts[1]) < 1 || eval(parts[1]) > 12)) {
				return false;
			}

			if (isNaN(parts[2]) || (eval(parts[2]) < 1 || eval(parts[2]) > 31)) {
				return false;
			}

			return true;
		}
	</script>
</body>
</html>