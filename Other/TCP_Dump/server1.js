const express = require('express');
const app = express();

app.get('/save', async (req, res) => {
    await new Promise((resolve) => setTimeout(resolve, 60000))
    res.send('Job Done');
});

app.listen(8191);