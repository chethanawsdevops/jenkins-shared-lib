package org.company.utils

class Logger implements Serializable {
    def steps
    Logger(steps) {
        this.steps = steps
    }

    def info(String msg) {
        steps.echo "[INFO] ${msg}"
    }
}