#!/bin/bash

function log() {
  echo "[$(date "+%Y-%m-%d %H:%M:%S")] ${1}"
}

while true; do
  log "开始任务"
  java -jar /app/BILIBILI-HELPER.jar /config/config.json >> /dev/null

  if [ $? -eq 0 ]; then
    log "任务正常结束"
  else
    log "任务异常退出，请检查日志"
  fi

  if [ -n ${TASK_DELAY} ]; then
    log "下次任务将在 ${TASK_DELAY} 后执行"
    sleep $TASK_DELAY
  else
    log "下次任务将在 1d 后执行"
    sleep 1d
  fi
done
