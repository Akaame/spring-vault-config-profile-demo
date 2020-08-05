# Spring Vault Profile Based Config Demo

## Aim of the Project

Spring Vault Config is used to fetch secrets from a HashiCorp Vault instance. 
However, for me, the real selling point was its ability to regard current spring profile during fetching secrets.

For this simple example you can execute 
 
> docker-compose up vault 

to create an in-memory version (which is fit for development purposes) of Vault.

During initialization Vault generates Tokens and Unseal Keys. 

Token is necessary for Spring Client to actually connect to Vault endpoint.

After launching Vault Create a KV Engine and create 

`springvaultdemo` Secret. Under this "node" you can create your profile nodes like so:

* `springvaultdemo/default`
* `springvaultdemo/test`
* `springvaultdemo/prod`

Let us create a simple kv in each of them

* `k: "public.key" v: "asdf_default"`
* `k: "public.key" v: "asdf_test"`
* `k: "public.key" v: "asdf_prod"`

Now if you set 
* `VAULT_TOKEN` to the token value during init
* `SPRING_PROFILES_ACTIVE` to default, test or prod

and run 

> docker-compose up --built vault-app