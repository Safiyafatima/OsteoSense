#!/bin/sh
set -e

echo "Starting Python FastAPI AI Risk Engine on port 8001..."
python3 -m uvicorn app:app --host 0.0.0.0 --port 8001 &

sleep 2

echo "Starting Spring Boot on port ${PORT:-8080}..."
exec java -Xmx320m -Xss512k -Dserver.port=${PORT:-8080} -jar /app/app.jar
