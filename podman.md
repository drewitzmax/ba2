# Docker Commands
## Run API
```docker run -d --net pod2-bridge --name api3 test-container:latest```
## Run Grafana k6 test
```docker run --net pod2-bridge --rm -i docker.io/grafana/k6 run - <1_little.js```
## Run curl for testing
```docker run --net test-bridge --rm docker.io/alpine/curl http://api:8080/ba2api/data/10```