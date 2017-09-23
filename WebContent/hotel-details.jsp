<%@ page language="java" contentType="text/html; charset=windows-1256"
import="java.util.List, com.travel.model.HotelDetails"
	pageEncoding="windows-1256"%>

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
			<h2>Hotel Details</h2>
			
			<% HotelDetails record = (HotelDetails)request.getSession().getAttribute("hotelDetails"); 
				%>
				<img src="<%=record.getHotelInfo().getHotelImageUrl()%>"/>	 
					<ul> 
				<li><%= record.getHotelInfo().getHotelName()%></li>
				<li>
				<%= record.getHotelInfo().getDescription()%></li>
				<li>
				<%= record.getHotelInfo().getHotelLongDestination()%></li>
				<li>
				Langauge: <%= record.getHotelInfo().getLanguage()%></li>
				<li>
				hotel site :<a  target="_blank" href="<%=record.getHotelUrls().getHotelInfositeUrl()%>">Click Here</a>
				<li>
				hotel location :<a target="_blank" href="https://www.google.com/maps/@<%=record.getHotelInfo().getHotelLocation()%>">Click Here</a>
			</li></ul>
		</div>
	</form>

</body>
</html>