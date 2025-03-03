function startCountdown(targetDate: string) {
    const countDownDate = new Date(targetDate).getTime();
    setInterval(() => {
        const now = new Date().getTime();
        const distance = countDownDate - now;
        if (distance < 0) {
            document.getElementById("countdown")!.innerHTML = "Event Started!";
            return;
        }
        const days = Math.floor(distance / (1000 * 60 * 60 * 24));
        document.getElementById("countdown")!.innerHTML = `${days} Days Left`;
    }, 1000);
}

startCountdown("2025-02-27");
