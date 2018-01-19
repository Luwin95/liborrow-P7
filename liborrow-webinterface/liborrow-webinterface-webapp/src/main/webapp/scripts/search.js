$(document).ready(function(){
	
    $('#addCriteria').click(function(){
        if($(this).prop('checked') == true)
        {
            $('#criterias').show();
            $('#singleStringSearch').hide();
            if($("#criteriaBook").prop('checked') != true)
            {
            	$('#formBook').hide();
            }
            if($("#criteriaAuthor").prop('checked') != true)
            {
            	 $('#formAuthor').hide();
            }
            if($("#criteriaMagazine").prop('checked') != true)
            {
            	$('#formMagazine').hide();
            }
        }else{
            $('#criterias').hide();
            $('#singleStringSearch').show();
        }
    });
    
    $("#criteriaBook").click(function(){
		 $('#formBook').show();
		 $('#formAuthor').hide();
		 $('#formMagazine').hide();
    });
    
    $("#criteriaAuthor").click(function(){
		 $('#formBook').hide();
		 $('#formAuthor').show();
		 $('#formMagazine').hide();
    });
    
    $("#criteriaMagazine").click(function(){
		 $('#formBook').hide();
		 $('#formAuthor').hide();
		 $('#formMagazine').show();
    });

});