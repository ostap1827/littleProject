<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
<%@ page import="java.util.List"%>

<div class="list-group">
	<ul id="categories">

	</ul>
</div>
<script>
	$(function() {
		$
				.get(
						"categories/all",
						function(data) {
							var categories = $('#categories');
							for ( var index in data) {
								categories
										.append('<a href="product/'+data[index]+'" class="list-group-item">'
												+ data[index] + '</a>')
							}
						});
	});
</script>

