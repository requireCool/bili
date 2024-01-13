#!/bin/bash
while true; do
  java -jar /app/BILIBILI-HELPER.jar /config/config.json >> /config/bilibili-help.log
  sleep $TASK_DELAY
done
