# demo app

# run
clean install jetty:run

# visit
- http://127.0.0.1:8181/demo-app
- http://127.0.0.1:8181/demo-app/rest/application.wadl
- http://127.0.0.1:8181/demo-app/rest/demo/getPathParam/jerry
- http://127.0.0.1:8181/demo-app/rest/demo/getQueryParam?name=jerry
- http://127.0.0.1:8181/demo-app/rest/demo/getBeanParam?name=jerry
- http://127.0.0.1:8181/demo-app/rest/demo/postFormParam?name=jerry
- http://127.0.0.1:8181/demo-app/rest/demo/postQueryParam?name=jerry
- http://127.0.0.1:8181/demo-app/rest/demo/postBeanParam?name=jerry