const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('o servidor esta rodando');
});

app.get('/api/teste', (req, res) => {
    res.json({
        status: 'ok',
        mensagem: 'API funcionando direitinho'
    });
});

app.listen(3000, () => {
    console.log('Servidor rodando em http://localhost:3000');
});