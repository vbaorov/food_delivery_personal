kubectl delete deploy callorder
kubectl delete service callorder
mvn package -B
docker build -t 651396752652.dkr.ecr.ap-northeast-2.amazonaws.com/callorder:latest .
docker push 651396752652.dkr.ecr.ap-northeast-2.amazonaws.com/callorder:latest
