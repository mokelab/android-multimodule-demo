package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data931RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data932RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data933RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data934RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data935RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data936RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data937RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data938RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data939RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data940RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen094ViewModel @Inject constructor(
    private val repo1: Data931RepositoryImpl,
    private val repo2: Data932RepositoryImpl,
    private val repo3: Data933RepositoryImpl,
    private val repo4: Data934RepositoryImpl,
    private val repo5: Data935RepositoryImpl,
    private val repo6: Data936RepositoryImpl,
    private val repo7: Data937RepositoryImpl,
    private val repo8: Data938RepositoryImpl,
    private val repo9: Data939RepositoryImpl,
    private val repo10: Data940RepositoryImpl,

): ViewModel() {
}
