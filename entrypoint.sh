#!/bin/bash
while true; do
  java -jar /app/BILIBILI-HELPER.jar /config/config.json >> /dev/null
  if [ -n $TASK_DELAY ]; then
    echo "下次任务将在${TASK_DELAY}后执行"
    sleep $TASK_DELAY
  else
    echo "下次任务将在1d后执行"
    sleep 1d
  fi
done
