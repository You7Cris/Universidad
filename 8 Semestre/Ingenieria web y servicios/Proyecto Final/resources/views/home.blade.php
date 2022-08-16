@extends('layouts.app')
@section('title','Inicio')
@section('location','Inicio')
@section('content')

@if(Session::has('create'))
    <script>
        setTimeout(function(){
                function_swal_confirm('{{Session::get('create')}}', 'creados')
        }, 500);
    </script>
@elseif(Session::has('update'))
    <script>
        setTimeout(function(){
            function_swal_confirm('{{Session::get('update')}}', 'editados')
        }, 500);
    </script>
@endif
@if (session('status'))
<div class="alert alert-success" role="alert">
    {{ session('status') }}
</div>
@endif

<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 mb-4">
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">¿Qué es BMI y BMR?</h6>
                </div>
                <div class="card-body">
                <p>El indice de masa corporal es una medicion del peso de una persona en cuanto a su altura. 
                    Es mas de un indicador que una medicion directa de la grasa del cuerpo entero de una persona. (BMI) </p>
                    <br>
                    <p>El BMR es la Tasa de Metabolismo Basal. Son las calorias que consumimos en reposo, sin hacer nada. 
                        Las que necesita nuestro cuerpo para vivir.
                    </p>
                    <div class="col-md-12 text-center d-xl-flex justify-content-xl-center" style="text-align: center;">
                        <div class="btn-group" role="group">
                            <a class="btn btn-success m-5" href="{{route('usuarios.index')}}" type="button">Consultar</a>
                            <a class="btn btn-primary m-5" href="{{route('usuarios.create')}}" type="button">Registro</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

              

<script>
    function function_swal_confirm(text, type) {
        swal("Informacion almacenada", "Los datos de "+text+" han sido "+type+" correctamente", "success");
    }
</script>
@endsection
