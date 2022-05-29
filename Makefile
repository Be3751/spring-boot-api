start:
	docker-compose up -d
build:
	docker-compose exec api-server sh gradlew build
run:
	docker-compose exec -d api-server java -jar build/libs/api-0.0.1-SNAPSHOT.jar
stop:
	docker-compose down