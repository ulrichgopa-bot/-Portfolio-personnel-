// Menu burger (mobile)
const burger = document.querySelector('.burger');
const nav = document.querySelector('.main-nav');

if (burger && nav) {
    burger.addEventListener('click', () => {
        nav.classList.toggle('open');
    });
}

// Validation simple du formulaire de contact
const form = document.getElementById('contactForm');
const confirmation = document.getElementById('contactConfirmation');

if (form && confirmation) {
    form.addEventListener('submit', (event) => {
        const nom = form.nom.value.trim();
        const email = form.email.value.trim();
        const objet = form.objet.value.trim();
        const message = form.message.value.trim();

        if (!nom || !email || !objet || !message) {
            event.preventDefault();
            confirmation.textContent = "Merci de remplir tous les champs obligatoires.";
            confirmation.style.color = "#c62828";
            return;
        }

        // Ici, côté front uniquement : on simule l’envoi
        event.preventDefault();
        confirmation.textContent = "Votre demande a bien été envoyée. Je vous répondrai dans les meilleurs délais.";
        confirmation.style.color = "#2e7d32";

        form.reset();
    });
}
