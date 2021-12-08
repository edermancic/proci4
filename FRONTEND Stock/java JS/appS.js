new Vue({
    el:'#app',
    data(){
        return{
            id:"",
            nombreproduc:"",
            optimo:"",
            actual:"",
            nombreprovedor:"",
            verproductos:{},
            idproduct:"",
            buscadornombre:"",
            nombres:[],
            buscadorprovedor:"",
            provedor:[],
            menu:0,
        }
    },
    methods:{
        saveproduct(){
            const endpoint="http://localhost:8080/productos";
            const options={
                method:'POST',
                headers:{'Content-Type':'application/json'},
                body:JSON.stringify({id:this.id,nombreproduc:this.nombreproduc,optimo:this.optimo,actual:this.actual,nombreprovedor:this.nombreprovedor})

            };
            fetch(endpoint,options).then(async Response=>{
                Swal.fire({
                    position: 'center',
                    icon: 'success',
                    title: 'Guardado',
                    showConfirmButton: false,
                    timer: 2500
              })
            });
        },
        lookproduct(){
            const endpoint="http://localhost:8080/productos"
            fetch(endpoint).then(async Response=>{
                this.verproductos=await Response.json();
            })
        },
        deletep(){
            const endpoint="http://localhost:8080/productos/"+this.idproduct;
            const options={method:'DELETE'};
            fetch(endpoint,options).then(async Response=>{
                Swal.fire({
                    position: 'center',
                    icon: 'success',
                    title: 'Eliminado',
                    showConfirmButton: false,
                    timer: 2500
              })
                this.deleteproduct="";
                this.lookproduct();
            })
        },
        busnombre(){
            const endpoint="http://localhost:8080/productos/prod/"+this.buscadornombre;
            const options={method:'GET'};
            fetch(endpoint,options).then(async Response=>{
                this.nombres= await Response.json();
            })

        },

        busprovedor(){
            const endpoint="http://localhost:8080/productos/prove/"+this.buscadorprovedor;
            const options={method:'GET'};
            fetch(endpoint,options).then(async Response=>{
                this.provedor= await Response.json();
            })

        },

    }
})