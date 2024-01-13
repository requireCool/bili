#!/bin/bash
while true; do
  java -jar /app/BILIBILI-HELPER.jar /config/config.json >> /config/bilibili-help.log
  if [ -n $TASK_DELAY ]; then
    sleep $TASK_DELAY
  else
    sleep 1d
  fi
done
