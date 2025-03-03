// TypeScript for countdown timer
function startCountdownTS(): void {
    const eventDate: number = new Date("2025-10-15T09:00:00").getTime();

    setInterval(() => {
        const now: number = new Date().getTime();
        const difference: number = eventDate - now;

        const days: number = Math.floor(difference / (1000 * 60 * 60 * 24));
        const hours: number = Math.floor((difference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        const minutes: number = Math.floor((difference % (1000 * 60 * 60)) / (1000 * 60));
        const seconds: number = Math.floor((difference % (1000 * 60)) / 1000);

        const countdownElement = document.getElementById("countdown");
        if (countdownElement) {
            countdownElement.innerHTML = `${days}d ${hours}h ${minutes}m ${seconds}s`;
        }
    }, 1000);
}

startCountdownTS();